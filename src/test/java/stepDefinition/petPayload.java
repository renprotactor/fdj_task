package stepDefinition;

public class petPayload {
    public static String baseURL = "https://petstore3.swagger.io";
    public static String resource = "api/v3/pet/";
    public static String petdeleteMessge = "Pet deleted";
//    public static int petId = 524;
//	public static String addPetName="Add Doggie";
//	public static String addCategoryName="Add Doggies";
//	public static String addStatus="available";
//	public static String addphotoURL="addURL";
//	public static String addTag="addTag";

//	public static String updatePetName="Update Doggie";
//	public static String updateCategoryName="Update Doggies";
//	public static String updateStatus="sold";
//	public static String updatephotoURL="UpdateURL";
//	public static String updateTag="UpdateTag";



    public static String AddPet(Integer Id, String addCategoryName, String addPetName, String addStatus, String addTag, String addURL) {
        return "{\n" +
                "  \"id\": " + Id + ",\n" +
                "  \"name\": \"" + addPetName + "\",\n" +
                "  \"category\": {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"" + addCategoryName + "\"\n" +
                "  },\n" +
                "  \"photoUrls\": [\n" +
                "    \"" + addURL + "\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"" + addTag + "\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"" + addStatus + "\"\n" +
                "}";


    }


    public static String UpdatePet(Integer Id,String addCategoryName, String updatePetName, String updatedStatus, String addTag, String addURL) {
        return

                "{\n" +
                        "  \"id\": " + Id + ",\n" +
                        "  \"name\": \"" + updatePetName + "\",\n" +
                        "  \"category\": {\n" +
                        "    \"id\": 1,\n" +
                        "    \"name\": \"" + addCategoryName + "\"\n" +
                        "  },\n" +
                        "  \"photoUrls\": [\n" +
                        "    \"" + addURL + "\"\n" +
                        "  ],\n" +
                        "  \"tags\": [\n" +
                        "    {\n" +
                        "      \"id\": 0,\n" +
                        "      \"name\": \"" + addTag + "\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"status\": \"" + updatedStatus + "\"\n" +
                        "}";


    }


}
