package yarnwrap.client.realms.gui.screen;
public class UploadResult { public net.minecraft.client.realms.gui.screen.UploadResult wrapperContained; public UploadResult(net.minecraft.client.realms.gui.screen.UploadResult wrapperContained) { this.wrapperContained = wrapperContained; }

public int statusCode() { return wrapperContained.statusCode; }
// public void statusCode(int value) { wrapperContained.statusCode = value; }
public java.lang.String errorMessage() { return wrapperContained.errorMessage; }
// public void errorMessage(java.lang.String value) { wrapperContained.errorMessage = value; }
// public UploadResult(int statusCode,java.lang.String errorMessage) { this.wrapperContained = new net.minecraft.client.realms.gui.screen.UploadResult(statusCode,errorMessage); }

}