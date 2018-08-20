package Test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@RestController
public class InfoController {
    @RequestMapping("/info")
    public HashMap index(HttpServletRequest request) {
        String str = request.getParameter("string");

        HashMap response = new HashMap();
        response.put("ErrCode", 0);
        response.put("ErrMsg", "success");

        HashMap data = new HashMap();
        data.put("String",str);
        response.put("Data", data);

        return response;
    }
}
