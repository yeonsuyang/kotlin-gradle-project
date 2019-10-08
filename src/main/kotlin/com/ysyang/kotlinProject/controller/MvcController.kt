package com.ysyang.kotlinProject.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

data class MyReqeustParams(var no:Int = 0, var name: String="")

@Controller
class MvcController {
    @RequestMapping("/mvc")
    fun doIndexGet(params: MyReqeustParams,model: Model) : String{

        model.addAttribute("params","Hello ${params.no}- ${params.name}")
        return "index"
    }
}

/*
1 Model addAttribute(String name, Object value)
:  value 객체를 name 이름으로 추가한다. 뷰 코드에서는 name으로 지정한 이름을 통해서 value를 사용한다.

2 Model addAttribute(Object value)
: value를 추가한다. value의 패키지 이름을 제외한 단순 클래스 이름을 모델 이름으로 사용한다. 이 때 첫 글자는 소문자로 처리한다.
  value가 배열이거나 컬렉션인 경우 첫 번째 원소의 클래스 이름 뒤에 "List"를 붙인 걸 모델 이름으로 사용한다.
  이 경우에도 클래스 이름의 첫자는 소문자로 처리한다.

3 Model addAllAttribute(Collection<?> values)
: addAttribute(Object value) 메서드를 이용해서 컬렉션에 포함된 객체들을 차례대로 추가한다.

4 Model AddAllAttributes(Map<String, ?> attributes)
: Map에 초함된 <키, 값>에 대해 키를 모델 이름으로 사용해서 값을 모델로 추가한다.

5 Model mergeAttributes(Map<String, ?> attributes)
: Map에 포함된 <키, 값>을 현재 모델에 추가한다. 단, 키와 동일한 이름을 갖는 모델 객체가 존재하지 않는 경우에만 추가된다.

6 boolean containsAttributes(String name)

 */
