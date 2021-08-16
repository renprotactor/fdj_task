Feature: Validating Pets store
    @Test
  Scenario Outline: Add, Update, Delete and Validate Pet data
      Given pet details
      When a new pet is added with details <petId> "<Add_Category_Name>" "<Add_Pet_Name>" "<Add_Status>" "<Add_TagName>" "<Add_PhotoUrl>"
      Then validate added pet details <petId>,"<Add_Pet_Name>" and "<Add_Status>" are as expected
      When pet <petId> details "<Add_Category_Name>" "<Updated_Pet_Name>" and "<Updated_Status>" "<Add_TagName>" "<Add_PhotoUrl>"
      Then validate updated pet details <petId>,"<Updated_Pet_Name>" and "<Updated_Status>" are as expected
      When pet <petId> is deleted
      Then validate pet <petId> is deleted

    Examples:
      | petId | Add_Category_Name | Add_Pet_Name | Add_Status | Add_TagName | Add_PhotoUrl | Updated_Category_Name | Updated_Pet_Name | Updated_Status | Updated_TagName | Updated_PhotoUrl |
      | 530   | Doggies           | AddName      | available  | addTag      | addURL       | Updated_Doggies       | Updated_AddName  | sold           | Updated_addTag  | Updated_addURL   |









