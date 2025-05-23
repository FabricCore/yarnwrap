package yarnwrap.client.realms.exception.upload;
public class FailedRealmsUploadException { public net.minecraft.client.realms.exception.upload.FailedRealmsUploadException wrapperContained; public FailedRealmsUploadException(net.minecraft.client.realms.exception.upload.FailedRealmsUploadException wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text errorMessage() { return new yarnwrap.text.Text(wrapperContained.errorMessage); }
// public void errorMessage(yarnwrap.text.Text value) { wrapperContained.errorMessage = value.wrapperContained; }
// public static yarnwrap.text.Text errorMessage() { return new yarnwrap.text.Text(net.minecraft.client.realms.exception.upload.FailedRealmsUploadException.errorMessage); }
// public static void errorMessage(yarnwrap.text.Text value, ) { net.minecraft.client.realms.exception.upload.FailedRealmsUploadException.errorMessage = value.wrapperContained; }

public FailedRealmsUploadException(java.lang.String errorMessage) { this.wrapperContained = new net.minecraft.client.realms.exception.upload.FailedRealmsUploadException(errorMessage); }
public FailedRealmsUploadException(yarnwrap.text.Text errorMessage) { this.wrapperContained = new net.minecraft.client.realms.exception.upload.FailedRealmsUploadException(errorMessage.wrapperContained); }

}