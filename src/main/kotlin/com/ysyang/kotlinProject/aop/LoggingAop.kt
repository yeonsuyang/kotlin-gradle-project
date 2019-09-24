package com.ysyang.kotlinProject.aop

import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.springframework.stereotype.Component

@Aspect
@Component
class LoggingAop{

    @Before("execution(* com.ysyang.kotlinProject.service.TestService.sayHello(..))") //*은 모든 반환타입 ..은 모든 매개변수
    fun beforeLogging(){
        println("beforeLogging.........................")
    }


}
