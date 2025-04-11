package yarnwrap.server.rcon;
public class BufferHelper { public net.minecraft.server.rcon.BufferHelper wrapperContained; public BufferHelper(net.minecraft.server.rcon.BufferHelper wrapperContained) { this.wrapperContained = wrapperContained; }

public char[] HEX_CHARS_LOOKUP() { return wrapperContained.HEX_CHARS_LOOKUP; }
// public void HEX_CHARS_LOOKUP(char[] value) { wrapperContained.HEX_CHARS_LOOKUP = value; }
// public int getIntLE(byte buf,int start) { return wrapperContained.getIntLE(buf,start); }
// public int getIntLE(byte buf,int start,int limit) { return wrapperContained.getIntLE(buf,start,limit); }
// public java.lang.String getString(byte buf) { return wrapperContained.getString(buf); }
// public int getIntBE(byte buf,int start,int limit) { return wrapperContained.getIntBE(buf,start,limit); }
public java.lang.String toHex(byte b) { return wrapperContained.toHex(b); }

}