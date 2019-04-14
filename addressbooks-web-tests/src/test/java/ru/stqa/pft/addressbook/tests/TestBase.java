package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.appmanager.ApplicationManager;

public class TestBase {

    protected final ApplicationManager applicationManager = new ApplicationManager();

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        applicationManager.init();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
      applicationManager.stop();

    }

    @Test
    public void testGroupDeletion() throws Exception {

      applicationManager.getNavigationHelper().gotoGroupPage();
      applicationManager.getGroupHelper().selectGroup();
      applicationManager.getGroupHelper().selectDeleteGroups();
      applicationManager.returnToGroupPage();
    }

}
