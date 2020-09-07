package interview_Prep;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

//Enter Born Year Return Current Age -done
//Now Calculate with Day and month
//Now Optimize
public class Return_Function {

public static Date stringTodate(String DOB) throws ParseException {
	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	Date date = formatter.parse(DOB);
	return date;

}

	public static void main(String[] args) throws ParseException {

		
		System.out.println(Return_Function.stringTodate("10-08-1994"));
		Instant instant = Return_Function.stringTodate("10-08-1994").toInstant();
		ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
		LocalDate givendate = zone.toLocalDate();
		Period peroid = Period.between(givendate, LocalDate.now());
		System.out.println("Year "+peroid.getYears());
		System.out.println("Month "+peroid.getMonths());
		System.out.println("Day "+peroid.getDays());

	}

}
