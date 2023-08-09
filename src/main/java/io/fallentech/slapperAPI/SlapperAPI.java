package io.fallentech.slapperAPI;

import cn.nukkit.plugin.PluginBase;
import io.fallentech.slapperAPI.Events.PluginEventHandler;

public class SlapperAPI extends PluginBase {

    @Override
    public void onEnable() {
        new PluginEventHandler(this);
//        getServer().getServiceManager().register(APIImpl.class, new APIImpl(), this, ServicePriority.NORMAL);
    }

}