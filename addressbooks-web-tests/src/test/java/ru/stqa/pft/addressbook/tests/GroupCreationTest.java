package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTest extends TestBase {


  @Test
  public void testGroupCreation() throws Exception {
    applicationManager.getNavigationHelper().gotoGroupPage();
    applicationManager.getGroupHelper().initGroupCreation();
    applicationManager.getGroupHelper().fillGroupForm(new GroupData("sdfg", "sdfdh", "sdffdbht"));
    applicationManager.getGroupHelper().submitGroupCreation();
    applicationManager.getGroupHelper().returnGroupPage();

  }


}
