package yarnwrap.client.realms.gui.screen;
public class UploadResult { public net.minecraft.client.realms.gui.screen.UploadResult wrapperContained; public UploadResult(net.minecraft.client.realms.gui.screen.UploadResult wrapperContained) { this.wrapperContained = wrapperContained; }

public int statusCode() { return wrapperContained.statusCode; }
public java.lang.String errorMessage() { return wrapperContained.errorMessage; }

}