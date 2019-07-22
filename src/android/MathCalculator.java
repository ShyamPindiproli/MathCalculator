package cordova-plugin-mathcalculator;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class MathCalculator extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if(action.equals("add"))
        {
            this.add(args,callbackContext);
            return true;
        }
        return false;
    }

    private void add(JSONARRAY args, callbackContext callback)
    {
        if(args != null)
        {
            try
            {
             int p1 = Integer.parseInt(args.getJSONObject(0).getString("param1"));
             int p2 = Integer.parseInt(args.getJSONObject(0).getString("param2"));
             callback.success(""+ (p1+p2));

            }catch(Exception ex)
            {
                callback.error("Seriously .. you got addition wrong" +ex);
            }

        }
        else{
            callback.error("C'mon ... You want to add null Values !! You can do one better ");
        }
    }

    private void subtract(JSONARRAY args, callbackContext callback)
    {
        if(args != null)
        {
            try
            {
                int p1 = Integer.parseInt(args.getJSONObject(0).getString("param1"));
                int p2 = Integer.parseInt(args.getJSONObject(0).getString("param2"));
                callback.success(""+ (p1-p2));

            }catch(Exception ex)
            {
                callback.error("Seriously .. you got basic subtraction wrong" +ex);
            }

        }
        else{
            callback.error("C'mon ... You want to subtract null Values !! You can do one better ");
        }
    }
    private void multiply(JSONARRAY args, callbackContext callback)
    {
        if(args != null)
        {
            try
            {
                int p1 = Integer.parseInt(args.getJSONObject(0).getString("param1"));
                int p2 = Integer.parseInt(args.getJSONObject(0).getString("param2"));
                callback.success(""+ (p1*p2));

            }catch(Exception ex)
            {
                callback.error("Seriously .. you got basic Multiplication wrong" +ex);
            }

        }
        else{
            callback.error("C'mon ... You want to multiply null Values !! You can do one better ");
        }
    }
    private void divide(JSONARRAY args, callbackContext callback)
    {
        if(args != null)
        {
            try
            {
                int p1 = Integer.parseInt(args.getJSONObject(0).getString("param1"));
                int p2 = Integer.parseInt(args.getJSONObject(0).getString("param2"));
                callback.success(""+ (p1/p2));

            }catch(Exception ex)
            {
                callback.error("You know can't do that ...right " +ex);
            }

        }
        else{
            callback.error("Gimme a break now ... Null Values division .. REALLY !! ");
        }
    }
}
