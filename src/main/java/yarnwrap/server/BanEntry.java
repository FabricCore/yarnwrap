package yarnwrap.server;
public class BanEntry { public net.minecraft.server.BanEntry wrapperContained; public BanEntry(net.minecraft.server.BanEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String source() { return wrapperContained.source; }
// public void source(java.lang.String value) { wrapperContained.source = value; }
// public static java.lang.String source() { return net.minecraft.server.BanEntry.source; }
// public static void source(java.lang.String value, ) { net.minecraft.server.BanEntry.source = value; }

// public java.util.Date expiryDate() { return wrapperContained.expiryDate; }
// public void expiryDate(java.util.Date value) { wrapperContained.expiryDate = value; }
// public static java.util.Date expiryDate() { return net.minecraft.server.BanEntry.expiryDate; }
// public static void expiryDate(java.util.Date value, ) { net.minecraft.server.BanEntry.expiryDate = value; }

// public java.util.Date creationDate() { return wrapperContained.creationDate; }
// public void creationDate(java.util.Date value) { wrapperContained.creationDate = value; }
// public static java.util.Date creationDate() { return net.minecraft.server.BanEntry.creationDate; }
// public static void creationDate(java.util.Date value, ) { net.minecraft.server.BanEntry.creationDate = value; }

// public java.lang.String reason() { return wrapperContained.reason; }
// public void reason(java.lang.String value) { wrapperContained.reason = value; }
// public static java.lang.String reason() { return net.minecraft.server.BanEntry.reason; }
// public static void reason(java.lang.String value, ) { net.minecraft.server.BanEntry.reason = value; }

// public java.text.SimpleDateFormat DATE_FORMAT() { return wrapperContained.DATE_FORMAT; }
// public void DATE_FORMAT(java.text.SimpleDateFormat value) { wrapperContained.DATE_FORMAT = value; }
public static java.text.SimpleDateFormat DATE_FORMAT() { return net.minecraft.server.BanEntry.DATE_FORMAT; }
// public static void DATE_FORMAT(java.text.SimpleDateFormat value, ) { net.minecraft.server.BanEntry.DATE_FORMAT = value; }

// public java.lang.String FOREVER() { return wrapperContained.FOREVER; }
// public void FOREVER(java.lang.String value) { wrapperContained.FOREVER = value; }
public static java.lang.String FOREVER() { return net.minecraft.server.BanEntry.FOREVER; }
// public static void FOREVER(java.lang.String value, ) { net.minecraft.server.BanEntry.FOREVER = value; }

// public BanEntry(java.lang.Object key,com.google.gson.JsonObject json) { this.wrapperContained = new net.minecraft.server.BanEntry(key,json); }
// public BanEntry(java.lang.Object key,java.util.Date creationDate,java.lang.String source,java.util.Date expiryDate,java.lang.String reason) { this.wrapperContained = new net.minecraft.server.BanEntry(key,creationDate,source,expiryDate,reason); }
public java.lang.String getSource() { return wrapperContained.getSource(); }
// public static java.lang.String getSource() { return net.minecraft.server.BanEntry.getSource(); }
public java.util.Date getExpiryDate() { return wrapperContained.getExpiryDate(); }
// public static java.util.Date getExpiryDate() { return net.minecraft.server.BanEntry.getExpiryDate(); }
public java.lang.String getReason() { return wrapperContained.getReason(); }
// public static java.lang.String getReason() { return net.minecraft.server.BanEntry.getReason(); }
public yarnwrap.text.Text toText() { return new yarnwrap.text.Text(wrapperContained.toText()); }
// public static yarnwrap.text.Text toText() { return new yarnwrap.text.Text(net.minecraft.server.BanEntry.toText()); }
public java.util.Date getCreationDate() { return wrapperContained.getCreationDate(); }
// public static java.util.Date getCreationDate() { return net.minecraft.server.BanEntry.getCreationDate(); }

}