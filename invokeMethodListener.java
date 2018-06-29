package testListners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class invokeMethodListener implements IInvokedMethodListener {

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		String s = method.getTestMethod().getConstructorOrMethod().getName();
		System.out.println("METHOD:"+s);
		String p = method.getTestMethod().getTestClass().getName();
		System.out.println(p);
		
	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}

}
