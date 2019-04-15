package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModificationTest extends TestBase {

      @Test

       public void testGroupModification(){

          applicationManager.getNavigationHelper().gotoGroupPage();
          applicationManager.getGroupHelper().selectGroup();
          applicationManager.getGroupHelper().initGroupModification();
          applicationManager.getGroupHelper().fillGroupForm(new GroupData("sdfg", "sdfdh", "sdffdbht"));
          applicationManager.getGroupHelper().submitGroupModification();
          applicationManager.getGroupHelper().returnGroupPage();


 }
}
