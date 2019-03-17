import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
public class ControladorUsuario {
    
   @RequestMapping(value = "/User", method = RequestMethod.GET)
   public ModelAndView User() {
      return new ModelAndView("User", "command", new User());
   }
   
   @RequestMapping(value = "/addUser", method = RequestMethod.POST)
   public String addUser(@ModelAttribute("SpringWeb")User user, 
   ModelMap model) {
      model.addAttribute("nombre", user.getNombre());
      model.addAttribute("password", user.getPassword());
      model.addAttribute("correo", user.getCorreo());
      model.addAttribute("fechaNacimiento", user.getFechaNacimiento());
      
      return "resultado";
   }
}
