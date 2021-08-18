package calcularidade;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Idade {

    public static int idadeCalc(String dtNasc, String padrao){
        DateFormat sdf = new SimpleDateFormat(padrao);
        Date dtNascInput = null;
        
        try {dtNascInput = sdf.parse(dtNasc);} 
        catch (Exception e) {}
        Calendar nascimento = new GregorianCalendar();
        nascimento.setTime(dtNascInput);
        
        Calendar hoje = Calendar.getInstance();
        int idade = hoje.get(Calendar.YEAR) - nascimento.get(Calendar.YEAR);
        nascimento.add(Calendar.YEAR, idade);
        
        if (hoje.before(nascimento)) {
            idade--;
        }
        return idade;
    }
}
