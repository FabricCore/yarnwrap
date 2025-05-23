package yarnwrap.client;
public class QuickPlay { public net.minecraft.client.QuickPlay wrapperContained; public QuickPlay(net.minecraft.client.QuickPlay wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text ERROR_TITLE() { return new yarnwrap.text.Text(wrapperContained.ERROR_TITLE); }
// public void ERROR_TITLE(yarnwrap.text.Text value) { wrapperContained.ERROR_TITLE = value.wrapperContained; }
public static yarnwrap.text.Text ERROR_TITLE() { return new yarnwrap.text.Text(net.minecraft.client.QuickPlay.ERROR_TITLE); }
// public static void ERROR_TITLE(yarnwrap.text.Text value, ) { net.minecraft.client.QuickPlay.ERROR_TITLE = value.wrapperContained; }

// public yarnwrap.text.Text ERROR_INVALID_IDENTIFIER() { return new yarnwrap.text.Text(wrapperContained.ERROR_INVALID_IDENTIFIER); }
// public void ERROR_INVALID_IDENTIFIER(yarnwrap.text.Text value) { wrapperContained.ERROR_INVALID_IDENTIFIER = value.wrapperContained; }
// public static yarnwrap.text.Text ERROR_INVALID_IDENTIFIER() { return new yarnwrap.text.Text(net.minecraft.client.QuickPlay.ERROR_INVALID_IDENTIFIER); }
// public static void ERROR_INVALID_IDENTIFIER(yarnwrap.text.Text value, ) { net.minecraft.client.QuickPlay.ERROR_INVALID_IDENTIFIER = value.wrapperContained; }

// public yarnwrap.text.Text ERROR_REALM_CONNECT() { return new yarnwrap.text.Text(wrapperContained.ERROR_REALM_CONNECT); }
// public void ERROR_REALM_CONNECT(yarnwrap.text.Text value) { wrapperContained.ERROR_REALM_CONNECT = value.wrapperContained; }
// public static yarnwrap.text.Text ERROR_REALM_CONNECT() { return new yarnwrap.text.Text(net.minecraft.client.QuickPlay.ERROR_REALM_CONNECT); }
// public static void ERROR_REALM_CONNECT(yarnwrap.text.Text value, ) { net.minecraft.client.QuickPlay.ERROR_REALM_CONNECT = value.wrapperContained; }

// public yarnwrap.text.Text ERROR_REALM_PERMISSION() { return new yarnwrap.text.Text(wrapperContained.ERROR_REALM_PERMISSION); }
// public void ERROR_REALM_PERMISSION(yarnwrap.text.Text value) { wrapperContained.ERROR_REALM_PERMISSION = value.wrapperContained; }
// public static yarnwrap.text.Text ERROR_REALM_PERMISSION() { return new yarnwrap.text.Text(net.minecraft.client.QuickPlay.ERROR_REALM_PERMISSION); }
// public static void ERROR_REALM_PERMISSION(yarnwrap.text.Text value, ) { net.minecraft.client.QuickPlay.ERROR_REALM_PERMISSION = value.wrapperContained; }

// public yarnwrap.text.Text TO_TITLE() { return new yarnwrap.text.Text(wrapperContained.TO_TITLE); }
// public void TO_TITLE(yarnwrap.text.Text value) { wrapperContained.TO_TITLE = value.wrapperContained; }
// public static yarnwrap.text.Text TO_TITLE() { return new yarnwrap.text.Text(net.minecraft.client.QuickPlay.TO_TITLE); }
// public static void TO_TITLE(yarnwrap.text.Text value, ) { net.minecraft.client.QuickPlay.TO_TITLE = value.wrapperContained; }

// public yarnwrap.text.Text TO_WORLD() { return new yarnwrap.text.Text(wrapperContained.TO_WORLD); }
// public void TO_WORLD(yarnwrap.text.Text value) { wrapperContained.TO_WORLD = value.wrapperContained; }
// public static yarnwrap.text.Text TO_WORLD() { return new yarnwrap.text.Text(net.minecraft.client.QuickPlay.TO_WORLD); }
// public static void TO_WORLD(yarnwrap.text.Text value, ) { net.minecraft.client.QuickPlay.TO_WORLD = value.wrapperContained; }

// public yarnwrap.text.Text TO_REALMS() { return new yarnwrap.text.Text(wrapperContained.TO_REALMS); }
// public void TO_REALMS(yarnwrap.text.Text value) { wrapperContained.TO_REALMS = value.wrapperContained; }
// public static yarnwrap.text.Text TO_REALMS() { return new yarnwrap.text.Text(net.minecraft.client.QuickPlay.TO_REALMS); }
// public static void TO_REALMS(yarnwrap.text.Text value, ) { net.minecraft.client.QuickPlay.TO_REALMS = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.QuickPlay.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.QuickPlay.LOGGER = value; }

// public boolean method_51258(long server) { return wrapperContained.method_51258(server); }
// public static boolean method_51258(long server, ) { return net.minecraft.client.QuickPlay.method_51258(server); }
// public void startRealms(yarnwrap.client.MinecraftClient client,yarnwrap.client.realms.RealmsClient realmsClient,java.lang.String realmId) { wrapperContained.startRealms(client.wrapperContained,realmsClient.wrapperContained,realmId); }
// public static void startRealms(yarnwrap.client.MinecraftClient client,yarnwrap.client.realms.RealmsClient realmsClient,java.lang.String realmId, ) { net.minecraft.client.QuickPlay.startRealms(client.wrapperContained,realmsClient.wrapperContained,realmId); }
// public void startQuickPlay(yarnwrap.client.MinecraftClient client,Object variant,yarnwrap.client.realms.RealmsClient realmsClient) { wrapperContained.startQuickPlay(client.wrapperContained,variant,realmsClient.wrapperContained); }
// public static void startQuickPlay(yarnwrap.client.MinecraftClient client,Object variant,yarnwrap.client.realms.RealmsClient realmsClient, ) { net.minecraft.client.QuickPlay.startQuickPlay(client.wrapperContained,variant,realmsClient.wrapperContained); }
// public void startSingleplayer(yarnwrap.client.MinecraftClient client,java.lang.String levelName) { wrapperContained.startSingleplayer(client.wrapperContained,levelName); }
// public static void startSingleplayer(yarnwrap.client.MinecraftClient client,java.lang.String levelName, ) { net.minecraft.client.QuickPlay.startSingleplayer(client.wrapperContained,levelName); }
// public void startMultiplayer(yarnwrap.client.MinecraftClient client,java.lang.String serverAddress) { wrapperContained.startMultiplayer(client.wrapperContained,serverAddress); }
// public static void startMultiplayer(yarnwrap.client.MinecraftClient client,java.lang.String serverAddress, ) { net.minecraft.client.QuickPlay.startMultiplayer(client.wrapperContained,serverAddress); }
// public java.lang.String getLatestLevelName(yarnwrap.world.level.storage.LevelStorage storage) { return wrapperContained.getLatestLevelName(storage.wrapperContained); }
// public static java.lang.String getLatestLevelName(yarnwrap.world.level.storage.LevelStorage storage, ) { return net.minecraft.client.QuickPlay.getLatestLevelName(storage.wrapperContained); }

}