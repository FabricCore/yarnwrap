package yarnwrap.client.realms.gui.screen;
public class UploadResult { public net.minecraft.client.realms.gui.screen.UploadResult wrapperContained; public UploadResult(net.minecraft.client.realms.gui.screen.UploadResult wrapperContained) { this.wrapperContained = wrapperContained; }

public int statusCode() { return wrapperContained.statusCode; }
// public void statusCode(int value) { wrapperContained.statusCode = value; }
// public static int statusCode() { return net.minecraft.client.realms.gui.screen.UploadResult.statusCode; }
// public static void statusCode(int value, ) { net.minecraft.client.realms.gui.screen.UploadResult.statusCode = value; }

public java.lang.String errorMessage() { return wrapperContained.errorMessage; }
// public void errorMessage(java.lang.String value) { wrapperContained.errorMessage = value; }
// public static java.lang.String errorMessage() { return net.minecraft.client.realms.gui.screen.UploadResult.errorMessage; }
// public static void errorMessage(java.lang.String value, ) { net.minecraft.client.realms.gui.screen.UploadResult.errorMessage = value; }

// public UploadResult(int statusCode,java.lang.String errorMessage) { this.wrapperContained = new net.minecraft.client.realms.gui.screen.UploadResult(statusCode,errorMessage); }

}