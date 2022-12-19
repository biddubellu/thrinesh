package com.hrm.TYSS.Leave;

import org.testng.annotations.Test;

import com.hrm.TYSS.GenericUtility.BaseClass;
import com.hrm.TYSS.ObjectRepository.ApplyLeavePage;
import com.hrm.TYSS.ObjectRepository.DashBoardPage;
import com.hrm.TYSS.ObjectRepository.LeavePage;
//bhsdsdgsdjjv
public class CreateLeaveTest extends BaseClass{
	@Test
	public void CreateLeave() throws Throwable {
		
		DashBoardPage dash=new DashBoardPage(driver);
		dash.ClickOnleaveMajortab();
		
		LeavePage leave=new LeavePage(driver);
		leave.clickLeaveButton();
		
		ApplyLeavePage apply=new ApplyLeavePage(driver);
		apply.Applyleave();
		
	}

}
