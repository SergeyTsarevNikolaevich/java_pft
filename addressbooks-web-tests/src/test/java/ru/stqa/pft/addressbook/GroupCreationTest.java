package ru.stqa.pft.addressbook;

import org.testng.annotations.Test;

public class GroupCreationTest extends TestBase {


  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("sdfg", "sdfdh", "sdffdbht"));
    submitGroupCreation();
    returnGroupPage();
    closeGoupPage();
  }


}
