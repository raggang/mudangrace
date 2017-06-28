package co.kr.mudangrace;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping ( value = "/" )
	public void home () {
		System.out.println( "hello word!" );
	}
}
