package yarnwrap.server;
public class BanEntry { public net.minecraft.server.BanEntry wrapperContained; public BanEntry(net.minecraft.server.BanEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String source() { return wrapperContained.source; }
// public java.util.Date expiryDate() { return wrapperContained.expiryDate; }
// public java.util.Date creationDate() { return wrapperContained.creationDate; }
// public java.lang.String reason() { return wrapperContained.reason; }
public java.text.SimpleDateFormat DATE_FORMAT() { return wrapperContained.DATE_FORMAT; }
public java.lang.String FOREVER() { return wrapperContained.FOREVER; }
public java.lang.String getSource() { return wrapperContained.getSource(); }
public java.util.Date getExpiryDate() { return wrapperContained.getExpiryDate(); }
public java.lang.String getReason() { return wrapperContained.getReason(); }
public yarnwrap.text.Text toText() { return new yarnwrap.text.Text(wrapperContained.toText()); }
public java.util.Date getCreationDate() { return wrapperContained.getCreationDate(); }

}