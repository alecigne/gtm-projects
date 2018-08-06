package org.formation.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {

	// @Before("execution(* org.formation.spring.model.IPerformance.perform(..))")
	// public void silenceCellPhones() {
	// System.out.println("Eteindre vos téléphones !!!");
	// }

	// Pas exécuté, c'est un raccourci
	@Pointcut("execution(* org.formation.spring.model.IPerformance.perform(..))")
	public void performance() {
	}

	// @Before("performance()")
	// @Before("execution(* org.formation.spring.model.IPerformance.perform(String))") // si méthode avec arg String
	// @Before("execution(* org.formation.spring.model.IPerformance.perform(..)) && args(yourString)") // récupérer un paramètre
	// || pour le ou (plusieurs méthodes)
	// public void silenceCellPhones() {
	// System.out.println("Eteindre vos téléphones !!!");
	// }
	//
	// @AfterReturning("performance()")
	// public void applause() {
	// System.out.println("Clap clap clap");
	// }
	//
	// @AfterThrowing("performance()")
	// public void reactToException() {
	// System.out.println("A MORT");
	// }

	// Accès à la méthode en cours d'exécution ; on fait tout en une seule fois
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp) {
		try {
			System.out.println("Silencing cell phones");
			System.out.println("Taking seats");
			jp.proceed();
			System.out.println("-> Méthode " + jp.getSignature().getName() + "()");
			System.out.println("Clap clap clap");
		} catch (Throwable e) {
			System.out.println("-> Méthode " + jp.getSignature().getName() + "()");
			System.out.println("Oooooh ! Shame !");
		}
	}
	
	

}
