package yarnwrap.data.loottable;
public class LootTableData { public net.minecraft.data.loottable.LootTableData wrapperContained; public LootTableData(net.minecraft.data.loottable.LootTableData wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Map WOOL_FROM_DYE_COLOR() { return wrapperContained.WOOL_FROM_DYE_COLOR; }
// public void WOOL_FROM_DYE_COLOR(java.util.Map value) { wrapperContained.WOOL_FROM_DYE_COLOR = value; }
public static java.util.Map WOOL_FROM_DYE_COLOR() { return net.minecraft.data.loottable.LootTableData.WOOL_FROM_DYE_COLOR; }
// public static void WOOL_FROM_DYE_COLOR(java.util.Map value, ) { net.minecraft.data.loottable.LootTableData.WOOL_FROM_DYE_COLOR = value; }


}