package yarnwrap.client;
public class QuickPlay { public net.minecraft.client.QuickPlay wrapperContained; public QuickPlay(net.minecraft.client.QuickPlay wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.text.Text ERROR_TITLE() { return new yarnwrap.text.Text(wrapperContained.ERROR_TITLE); }
// public void ERROR_TITLE(yarnwrap.text.Text value) { wrapperContained.ERROR_TITLE = value.wrapperContained; }
// public yarnwrap.text.Text ERROR_INVALID_IDENTIFIER() { return new yarnwrap.text.Text(wrapperContained.ERROR_INVALID_IDENTIFIER); }
// public void ERROR_INVALID_IDENTIFIER(yarnwrap.text.Text value) { wrapperContained.ERROR_INVALID_IDENTIFIER = value.wrapperContained; }
// public yarnwrap.text.Text ERROR_REALM_CONNECT() { return new yarnwrap.text.Text(wrapperContained.ERROR_REALM_CONNECT); }
// public void ERROR_REALM_CONNECT(yarnwrap.text.Text value) { wrapperContained.ERROR_REALM_CONNECT = value.wrapperContained; }
// public yarnwrap.text.Text ERROR_REALM_PERMISSION() { return new yarnwrap.text.Text(wrapperContained.ERROR_REALM_PERMISSION); }
// public void ERROR_REALM_PERMISSION(yarnwrap.text.Text value) { wrapperContained.ERROR_REALM_PERMISSION = value.wrapperContained; }
// public yarnwrap.text.Text TO_TITLE() { return new yarnwrap.text.Text(wrapperContained.TO_TITLE); }
// public void TO_TITLE(yarnwrap.text.Text value) { wrapperContained.TO_TITLE = value.wrapperContained; }
// public yarnwrap.text.Text TO_WORLD() { return new yarnwrap.text.Text(wrapperContained.TO_WORLD); }
// public void TO_WORLD(yarnwrap.text.Text value) { wrapperContained.TO_WORLD = value.wrapperContained; }
// public yarnwrap.text.Text TO_REALMS() { return new yarnwrap.text.Text(wrapperContained.TO_REALMS); }
// public void TO_REALMS(yarnwrap.text.Text value) { wrapperContained.TO_REALMS = value.wrapperContained; }
// public void startRealms(yarnwrap.client.MinecraftClient client,yarnwrap.client.realms.RealmsClient realmsClient,java.lang.String realmId) { wrapperContained.startRealms(client.wrapperContained,realmsClient.wrapperContained,realmId); }
// public void startQuickPlay(yarnwrap.client.MinecraftClient client,Object quickPlay,yarnwrap.client.realms.RealmsClient realmsClient) { wrapperContained.startQuickPlay(client.wrapperContained,quickPlay,realmsClient.wrapperContained); }
// public void startSingleplayer(yarnwrap.client.MinecraftClient client,java.lang.String levelName) { wrapperContained.startSingleplayer(client.wrapperContained,levelName); }
// public void startMultiplayer(yarnwrap.client.MinecraftClient client,java.lang.String serverAddress) { wrapperContained.startMultiplayer(client.wrapperContained,serverAddress); }

}