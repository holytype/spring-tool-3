package kh.mclass.xyz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdviceLog {
	@Pointcut("execution(public * kh..*Dao.*(..))")
	public void daoPointcut() {}
	@Pointcut("execution(public * kh..*Service.*(..))")
	public void servicePointcut() {}
	@Pointcut("execution(public * kh..*Controller.*(..))")
	public void controllerPointcut() {}
	
	@Around("daoPointcut()")
	public Object aroundDaoLog(ProceedingJoinPoint pjp) {
		
		Object returnObj = null;
		
		//getThis>클래스명//getSignature().getName>메소드명
		System.out.println("객체명"+pjp.getThis()+":"+pjp.getSignature().getName());
		
		Object[] args = pjp.getArgs();
		for(int i=0; i<args.length;i++) {
			System.out.println("["+i+"]"+args[i]+"");
		}
		
		//
		returnObj = pjp.proceed();
		System.out.println();
		return returnObj;
	}
}
