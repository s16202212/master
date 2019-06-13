package webadv.s16202212.p9.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.assertj.core.util.Arrays;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {

	@Pointcut("execution( * webadv.s16202212.p9.repository.TeacherRepository.*(..))")
	public void pointcut() {}
	
	@Before("pointcut()")
	public void log(JoinPoint jp){
		String methodName = jp.getSignature().getName();
		System.out.println("the method [" + methodName + "] begins with " + Arrays.asList(jp.getArgs()));
	}
		
}