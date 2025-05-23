package yarnwrap.item;
public class CompassItem { public net.minecraft.item.CompassItem wrapperContained; public CompassItem(net.minecraft.item.CompassItem wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text LODESTONE_COMPASS_NAME() { return new yarnwrap.text.Text(wrapperContained.LODESTONE_COMPASS_NAME); }
// public void LODESTONE_COMPASS_NAME(yarnwrap.text.Text value) { wrapperContained.LODESTONE_COMPASS_NAME = value.wrapperContained; }
// public static yarnwrap.text.Text LODESTONE_COMPASS_NAME() { return new yarnwrap.text.Text(net.minecraft.item.CompassItem.LODESTONE_COMPASS_NAME); }
// public static void LODESTONE_COMPASS_NAME(yarnwrap.text.Text value, ) { net.minecraft.item.CompassItem.LODESTONE_COMPASS_NAME = value.wrapperContained; }


}