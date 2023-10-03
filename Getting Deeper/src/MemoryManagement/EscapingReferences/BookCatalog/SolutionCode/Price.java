package MemoryManagement.EscapingReferences.BookCatalog.SolutionCode;
import java.util.HashMap;
import java.util.Map;

public class Price {
    private Map<String, Double> rates;
    private Double value;

    public Price(Double value){
        this.value = value;
        rates = new HashMap<String, Double>();
        rates.put("USD", 1d);
        rates.put("GBP", 0.6);
        rates.put("EUR", 0.8);
    }

    public Double convert(String toCurrency){
        if(toCurrency.equals("USD")){
            return value;
        }
        else{
            Double conversion = rates.get("USD") / rates.get(toCurrency);

            // value = conversion * value; instead of changing the value of the object, we should just return the value after conversion
            return conversion * value;
        }
    }

    public String toString(){
        return this.value.toString();
    }

    // TODO: Definitely an escaping reference.
   /* public Map<String, Double> getRates(){
        return rates;
    }*/

    // Now we are just returning double instead of Map. And Double is immutable.
    // We didn't need to create whole collection since it didn't make sense to give whole list.
    // that's why we are returning the desired currency rate in single Double.
    public Double getRates(String currency){
        return rates.get(currency);
    }

}
