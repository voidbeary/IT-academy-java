import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExtraTask {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader("src/main/resources/users.json")) {
            Object obj = jsonParser.parse(reader);
            JSONArray usersList = (JSONArray) obj;


            List<User> participantList = new ArrayList<>();

            for (Object user : usersList) {
                JSONObject json_user = (JSONObject) user;
                User parsedUser = parseEmployeeObject(json_user);
                participantList.add(parsedUser);
            }

            for (User user : participantList) {
                user.print();
            }

            Comparator<User> sortByAge = new Comparator<User>() {
                public int compare(User userA, User userB) {
                    if (userA.getAge() > userB.getAge()) {
                        return 1;
                    } else if (userA.getAge() < userB.getAge()) {
                        return -1;
                    }
                    return 0;
                }
            };

            participantList.sort(sortByAge);

            System.out.println("---------------------------------------");
            for (User user : participantList) {
                user.print();
            }

            List<User> filteredList = participantList.stream().filter(user -> {
                if (user.getUserid() == null) {
                    return false;
                }
                return Integer.valueOf(user.getUserid()) > 10000;
            }).collect(Collectors.toList());

            System.out.println("---------------------------------------");
            for (User user : filteredList) {
                user.print();
            }
            System.out.println("---------------------------------------");
            System.out.println("The youngest is:");
            filteredList.get(0).print();
            System.out.println("---------------------------------------");
            System.out.println("The oldest is:");

            filteredList.get(filteredList.size() - 1).print();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static User parseEmployeeObject(JSONObject user) {
        //Get employee object within list
        JSONObject employeeObject = (JSONObject) user.get("user");

        //Get user first name
        String firstName = (String) employeeObject.get("firstname");
        String lastName = (String) employeeObject.get("lastname");
        String city = (String) employeeObject.get("city");
        String country = (String) employeeObject.get("Country");
        String age = (String) employeeObject.get("age");
        String countryCode = (String) employeeObject.get("countryCode");
        String email = (String) employeeObject.get("email");
        String userid = (String) employeeObject.get("userid");

        int parsedAge = Integer.valueOf(age);


        User parsedUser = new User(firstName, lastName, city, country, parsedAge, countryCode, email, userid);
        return parsedUser;


        //TODO: Make application working. There could be problems with gradle, refresh dependencies.
        //TODO: Create User class with parameters from user.json file.
        //TODO: Set User firstname, lastName... Use Enum for country code.
        //TODO: Create User list and add all Users.
        //TODO: Order list from youngest user to oldest (Use Custom Comparator).
        //TODO: Filter list by userId > 10000. If ID is not existent, remove those users. (Use Stream)
        //TODO: Find the Oldest and the Youngest user.
    }
}
