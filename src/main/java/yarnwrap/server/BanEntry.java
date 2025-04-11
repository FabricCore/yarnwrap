package yarnwrap.server;
public class BanEntry { public net.minecraft.server.BanEntry wrapperContained; public BanEntry(net.minecraft.server.BanEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String source() { return wrapperContained.source; }
// public void source(java.lang.String value) { wrapperContained.source = value; }
// public java.util.Date expiryDate() { return wrapperContained.expiryDate; }
// public void expiryDate(java.util.Date value) { wrapperContained.expiryDate = value; }
// public java.util.Date creationDate() { return wrapperContained.creationDate; }
// public void creationDate(java.util.Date value) { wrapperContained.creationDate = value; }
// public java.lang.String reason() { return wrapperContained.reason; }
// public void reason(java.lang.String value) { wrapperContained.reason = value; }
public java.text.SimpleDateFormat DATE_FORMAT() { return wrapperContained.DATE_FORMAT; }
// public void DATE_FORMAT(java.text.SimpleDateFormat value) { wrapperContained.DATE_FORMAT = value; }
public java.lang.String FOREVER() { return wrapperContained.FOREVER; }
// public void FOREVER(java.lang.String value) { wrapperContained.FOREVER = value; }
// public BanEntry(java.lang.Object key,com.google.gson.JsonObject json) { this.wrapperContained = new net.minecraft.server.BanEntry(key,json); }
// public BanEntry(java.lang.Object key,java.util.Date creationDate,java.lang.String source,java.util.Date expiryDate,java.lang.String reason) { this.wrapperContained = new net.minecraft.server.BanEntry(key,creationDate,source,expiryDate,reason); }
public java.lang.String getSource() { return wrapperContained.getSource(); }
public java.util.Date getExpiryDate() { return wrapperContained.getExpiryDate(); }
public java.lang.String getReason() { return wrapperContained.getReason(); }
public yarnwrap.text.Text toText() { return new yarnwrap.text.Text(wrapperContained.toText()); }
public java.util.Date getCreationDate() { return wrapperContained.getCreationDate(); }

}