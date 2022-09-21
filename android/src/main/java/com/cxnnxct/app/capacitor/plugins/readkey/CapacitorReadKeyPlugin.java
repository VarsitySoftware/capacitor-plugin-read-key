package com.cxnnxct.app.capacitor.plugins.readkey;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import android.app.Activity;

@CapacitorPlugin(name = "CapacitorReadKey")
public class CapacitorReadKeyPlugin extends Plugin {

    private CapacitorReadKey implementation = new CapacitorReadKey();

    @PluginMethod
    public void read(PluginCall call) {
        //String value = call.getString("value");

        //JSObject ret = new JSObject();
        //ret.put("value", implementation.echo(value));
        //call.resolve(ret);

        String key = call.getString("key");

        final Activity activity = getActivity();

        String packageName = activity.getPackageName();

        int resId = activity.getResources().getIdentifier(key, "string", packageName);
        String value = activity.getString(resId);

        JSObject ret = new JSObject();
        //ret.put("value", value);
        //call.success(ret);

        ret.put("value", implementation.read(value));
        call.resolve(ret);
    }
}
