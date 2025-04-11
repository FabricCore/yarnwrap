package yarnwrap.datafixer.fix;
public class ItemIdFix { public net.minecraft.datafixer.fix.ItemIdFix wrapperContained; public ItemIdFix(net.minecraft.datafixer.fix.ItemIdFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public it.unimi.dsi.fastutil.ints.Int2ObjectMap NUMERICAL_ID_TO_STRING_ID_MAP() { return wrapperContained.NUMERICAL_ID_TO_STRING_ID_MAP; }
// public void NUMERICAL_ID_TO_STRING_ID_MAP(it.unimi.dsi.fastutil.ints.Int2ObjectMap value) { wrapperContained.NUMERICAL_ID_TO_STRING_ID_MAP = value; }
public java.lang.String fromId(int id) { return wrapperContained.fromId(id); }

}