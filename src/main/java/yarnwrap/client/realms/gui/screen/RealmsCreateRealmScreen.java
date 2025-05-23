package yarnwrap.client.realms.gui.screen;
public class RealmsCreateRealmScreen { public net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen wrapperContained; public RealmsCreateRealmScreen(net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.realms.gui.screen.RealmsMainScreen parent() { return new yarnwrap.client.realms.gui.screen.RealmsMainScreen(wrapperContained.parent); }
// public void parent(yarnwrap.client.realms.gui.screen.RealmsMainScreen value) { wrapperContained.parent = value.wrapperContained; }
// public static yarnwrap.client.realms.gui.screen.RealmsMainScreen parent() { return new yarnwrap.client.realms.gui.screen.RealmsMainScreen(net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen.parent); }
// public static void parent(yarnwrap.client.realms.gui.screen.RealmsMainScreen value, ) { net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen.parent = value.wrapperContained; }

// public yarnwrap.client.gui.widget.TextFieldWidget nameBox() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.nameBox); }
// public void nameBox(yarnwrap.client.gui.widget.TextFieldWidget value) { wrapperContained.nameBox = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.TextFieldWidget nameBox() { return new yarnwrap.client.gui.widget.TextFieldWidget(net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen.nameBox); }
// public static void nameBox(yarnwrap.client.gui.widget.TextFieldWidget value, ) { net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen.nameBox = value.wrapperContained; }

// public yarnwrap.client.gui.widget.TextFieldWidget descriptionBox() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.descriptionBox); }
// public void descriptionBox(yarnwrap.client.gui.widget.TextFieldWidget value) { wrapperContained.descriptionBox = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.TextFieldWidget descriptionBox() { return new yarnwrap.client.gui.widget.TextFieldWidget(net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen.descriptionBox); }
// public static void descriptionBox(yarnwrap.client.gui.widget.TextFieldWidget value, ) { net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen.descriptionBox = value.wrapperContained; }

// public yarnwrap.text.Text WORLD_NAME_TEXT() { return new yarnwrap.text.Text(wrapperContained.WORLD_NAME_TEXT); }
// public void WORLD_NAME_TEXT(yarnwrap.text.Text value) { wrapperContained.WORLD_NAME_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text WORLD_NAME_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen.WORLD_NAME_TEXT); }
// public static void WORLD_NAME_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen.WORLD_NAME_TEXT = value.wrapperContained; }

// public yarnwrap.text.Text WORLD_DESCRIPTION_TEXT() { return new yarnwrap.text.Text(wrapperContained.WORLD_DESCRIPTION_TEXT); }
// public void WORLD_DESCRIPTION_TEXT(yarnwrap.text.Text value) { wrapperContained.WORLD_DESCRIPTION_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text WORLD_DESCRIPTION_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen.WORLD_DESCRIPTION_TEXT); }
// public static void WORLD_DESCRIPTION_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen.WORLD_DESCRIPTION_TEXT = value.wrapperContained; }

// public yarnwrap.client.gui.widget.ThreePartsLayoutWidget layout() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(wrapperContained.layout); }
// public void layout(yarnwrap.client.gui.widget.ThreePartsLayoutWidget value) { wrapperContained.layout = value.wrapperContained; }
// public static yarnwrap.client.gui.widget.ThreePartsLayoutWidget layout() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen.layout); }
// public static void layout(yarnwrap.client.gui.widget.ThreePartsLayoutWidget value, ) { net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen.layout = value.wrapperContained; }

// public java.lang.Runnable worldCreator() { return wrapperContained.worldCreator; }
// public void worldCreator(java.lang.Runnable value) { wrapperContained.worldCreator = value; }
// public static java.lang.Runnable worldCreator() { return net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen.worldCreator; }
// public static void worldCreator(java.lang.Runnable value, ) { net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen.worldCreator = value; }

// public yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(wrapperContained.TITLE_TEXT); }
// public void TITLE_TEXT(yarnwrap.text.Text value) { wrapperContained.TITLE_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text TITLE_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen.TITLE_TEXT); }
// public static void TITLE_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen.TITLE_TEXT = value.wrapperContained; }

public RealmsCreateRealmScreen(yarnwrap.client.realms.gui.screen.RealmsMainScreen parent,yarnwrap.client.realms.dto.RealmsServer server,boolean prerelease) { this.wrapperContained = new net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen(parent.wrapperContained,server.wrapperContained,prerelease); }
// public void createWorld(yarnwrap.client.realms.dto.RealmsServer realmsServer,boolean prerelease) { wrapperContained.createWorld(realmsServer.wrapperContained,prerelease); }
// public static void createWorld(yarnwrap.client.realms.dto.RealmsServer realmsServer,boolean prerelease, ) { net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen.createWorld(realmsServer.wrapperContained,prerelease); }
// public void method_52665(yarnwrap.client.realms.gui.screen.RealmsCreateRealmScreen child) { wrapperContained.method_52665(child.wrapperContained); }
// public static void method_52665(yarnwrap.client.realms.gui.screen.RealmsCreateRealmScreen child, ) { net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen.method_52665(child.wrapperContained); }
// public void method_52666(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_52666(button.wrapperContained); }
// public static void method_52666(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen.method_52666(button.wrapperContained); }
// public void method_52667(yarnwrap.client.gui.widget.ButtonWidget name) { wrapperContained.method_52667(name.wrapperContained); }
// public static void method_52667(yarnwrap.client.gui.widget.ButtonWidget name, ) { net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen.method_52667(name.wrapperContained); }
// public void method_54374(yarnwrap.client.gui.widget.ButtonWidget button) { wrapperContained.method_54374(button.wrapperContained); }
// public static void method_54374(yarnwrap.client.gui.widget.ButtonWidget button, ) { net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen.method_54374(button.wrapperContained); }
// public yarnwrap.client.realms.dto.RealmsServer createPrereleaseServer(yarnwrap.client.realms.dto.RealmsServer parent) { return new yarnwrap.client.realms.dto.RealmsServer(wrapperContained.createPrereleaseServer(parent.wrapperContained)); }
// public static yarnwrap.client.realms.dto.RealmsServer createPrereleaseServer(yarnwrap.client.realms.dto.RealmsServer parent, ) { return new yarnwrap.client.realms.dto.RealmsServer(net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen.createPrereleaseServer(parent.wrapperContained)); }
// public java.lang.Void method_64358(java.lang.Throwable throwable) { return wrapperContained.method_64358(throwable); }
// public static java.lang.Void method_64358(java.lang.Throwable throwable, ) { return net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen.method_64358(throwable); }
// public void method_64360(java.util.concurrent.atomic.AtomicBoolean prereleaseServer) { wrapperContained.method_64360(prereleaseServer); }
// public static void method_64360(java.util.concurrent.atomic.AtomicBoolean prereleaseServer, ) { net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen.method_64360(prereleaseServer); }
// public void createWorld(yarnwrap.client.realms.dto.RealmsServer server) { wrapperContained.createWorld(server.wrapperContained); }
// public static void createWorld(yarnwrap.client.realms.dto.RealmsServer server, ) { net.minecraft.client.realms.gui.screen.RealmsCreateRealmScreen.createWorld(server.wrapperContained); }

}