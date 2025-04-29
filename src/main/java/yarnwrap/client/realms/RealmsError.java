package yarnwrap.client.realms;
public class RealmsError { public net.minecraft.client.realms.RealmsError wrapperContained; public RealmsError(net.minecraft.client.realms.RealmsError wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
public static org.slf4j.Logger LOGGER() { return net.minecraft.client.realms.RealmsError.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.realms.RealmsError.LOGGER = value; }

// public yarnwrap.text.Text NO_DETAILS_TEXT() { return new yarnwrap.text.Text(wrapperContained.NO_DETAILS_TEXT); }
// public void NO_DETAILS_TEXT(yarnwrap.text.Text value) { wrapperContained.NO_DETAILS_TEXT = value.wrapperContained; }
public static yarnwrap.text.Text NO_DETAILS_TEXT() { return new yarnwrap.text.Text(net.minecraft.client.realms.RealmsError.NO_DETAILS_TEXT); }
// public static void NO_DETAILS_TEXT(yarnwrap.text.Text value, ) { net.minecraft.client.realms.RealmsError.NO_DETAILS_TEXT = value.wrapperContained; }

public java.lang.String getErrorMessage() { return wrapperContained.getErrorMessage(); }
// public static java.lang.String getErrorMessage() { return net.minecraft.client.realms.RealmsError.getErrorMessage(); }
public int getErrorCode() { return wrapperContained.getErrorCode(); }
// public static int getErrorCode() { return net.minecraft.client.realms.RealmsError.getErrorCode(); }
// public yarnwrap.client.realms.RealmsError ofHttp(int statusCode,java.lang.String response) { return new yarnwrap.client.realms.RealmsError(wrapperContained.ofHttp(statusCode,response)); }
// public static yarnwrap.client.realms.RealmsError ofHttp(int statusCode,java.lang.String response, ) { return new yarnwrap.client.realms.RealmsError(net.minecraft.client.realms.RealmsError.ofHttp(statusCode,response)); }
public yarnwrap.text.Text getText() { return new yarnwrap.text.Text(wrapperContained.getText()); }
// public static yarnwrap.text.Text getText() { return new yarnwrap.text.Text(net.minecraft.client.realms.RealmsError.getText()); }

}