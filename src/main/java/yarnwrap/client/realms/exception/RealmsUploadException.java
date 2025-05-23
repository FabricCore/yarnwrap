package yarnwrap.client.realms.exception;
public class RealmsUploadException { public net.minecraft.client.realms.exception.RealmsUploadException wrapperContained; public RealmsUploadException(net.minecraft.client.realms.exception.RealmsUploadException wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.text.Text getStatus() { return new yarnwrap.text.Text(wrapperContained.getStatus()); }
// public static yarnwrap.text.Text getStatus() { return new yarnwrap.text.Text(net.minecraft.client.realms.exception.RealmsUploadException.getStatus()); }
public net.minecraft.text.Text[] getStatusTexts() { return wrapperContained.getStatusTexts(); }
// public static net.minecraft.text.Text[] getStatusTexts() { return net.minecraft.client.realms.exception.RealmsUploadException.getStatusTexts(); }

}