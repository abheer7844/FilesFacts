package testListners;

import java.util.ArrayList;
import java.util.List;
import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

public class ImethodInterceptorlistner implements IMethodInterceptor {

	public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
		List<IMethodInstance> result = new ArrayList<IMethodInstance>();
	    for (IMethodInstance method : methods) {
	
	    		if(method.getMethod().getMethodName().equals("testMethod"))  
	          {
	             result.add(method);
	          }
	    }
	 return result;
	}

}
