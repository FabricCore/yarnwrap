package yarnwrap.client.realms.task;
public class ResettingWorldTask { public net.minecraft.client.realms.task.ResettingWorldTask wrapperContained; public ResettingWorldTask(net.minecraft.client.realms.task.ResettingWorldTask wrapperContained) { this.wrapperContained = wrapperContained; }

// public long serverId() { return wrapperContained.serverId; }
// public void serverId(long value) { wrapperContained.serverId = value; }
// public yarnwrap.text.Text title() { return new yarnwrap.text.Text(wrapperContained.title); }
// public void title(yarnwrap.text.Text value) { wrapperContained.title = value.wrapperContained; }
// public java.lang.Runnable callback() { return wrapperContained.callback; }
// public void callback(java.lang.Runnable value) { wrapperContained.callback = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public ResettingWorldTask(long serverId,yarnwrap.text.Text title,java.lang.Runnable callback) { this.wrapperContained = new net.minecraft.client.realms.task.ResettingWorldTask(serverId,title.wrapperContained,callback); }
// public void resetWorld(yarnwrap.client.realms.RealmsClient client,long worldId) { wrapperContained.resetWorld(client.wrapperContained,worldId); }

}