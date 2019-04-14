package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTest extends TestBase {


  @Test
  public void testGroupCreation() throws Exception {
    applicationManager.gotoGroupPage();
    applicationManager.initGroupCreation();
    applicationManager.fillGroupForm(new GroupData("sdfg", "sdfdh", "sdffdbht"));
    applicationManager.submitGroupCreation();
    applicationManager.returnGroupPage();
    applicationManager.closeGoupPage();
  }


}
