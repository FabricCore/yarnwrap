package yarnwrap.client.gui.widget;
public class GridWidget { public net.minecraft.client.gui.widget.GridWidget wrapperContained; public GridWidget(net.minecraft.client.gui.widget.GridWidget wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List children() { return wrapperContained.children; }
// public void children(java.util.List value) { wrapperContained.children = value; }
// public java.util.List grids() { return wrapperContained.grids; }
// public void grids(java.util.List value) { wrapperContained.grids = value; }
// public yarnwrap.client.gui.widget.Positioner mainPositioner() { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.mainPositioner); }
// public void mainPositioner(yarnwrap.client.gui.widget.Positioner value) { wrapperContained.mainPositioner = value.wrapperContained; }
// public int rowSpacing() { return wrapperContained.rowSpacing; }
// public void rowSpacing(int value) { wrapperContained.rowSpacing = value; }
// public int columnSpacing() { return wrapperContained.columnSpacing; }
// public void columnSpacing(int value) { wrapperContained.columnSpacing = value; }
public yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget,int row,int column) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.add(widget.wrapperContained,row,column)); }
public yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget,int row,int column,int occupiedRows,int occupiedColumns) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.add(widget.wrapperContained,row,column,occupiedRows,occupiedColumns)); }
public yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget,int row,int column,int occupiedRows,int occupiedColumns,yarnwrap.client.gui.widget.Positioner positioner) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.add(widget.wrapperContained,row,column,occupiedRows,occupiedColumns,positioner.wrapperContained)); }
public yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget,int row,int column,yarnwrap.client.gui.widget.Positioner positioner) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.add(widget.wrapperContained,row,column,positioner.wrapperContained)); }
public yarnwrap.client.gui.widget.Positioner copyPositioner() { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.copyPositioner()); }
public yarnwrap.client.gui.widget.Positioner getMainPositioner() { return new yarnwrap.client.gui.widget.Positioner(wrapperContained.getMainPositioner()); }
public Object createAdder(int columns) { return wrapperContained.createAdder(columns); }
public yarnwrap.client.gui.widget.GridWidget setColumnSpacing(int columnSpacing) { return new yarnwrap.client.gui.widget.GridWidget(wrapperContained.setColumnSpacing(columnSpacing)); }
public yarnwrap.client.gui.widget.GridWidget setRowSpacing(int rowSpacing) { return new yarnwrap.client.gui.widget.GridWidget(wrapperContained.setRowSpacing(rowSpacing)); }
public yarnwrap.client.gui.widget.GridWidget setSpacing(int spacing) { return new yarnwrap.client.gui.widget.GridWidget(wrapperContained.setSpacing(spacing)); }
public yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget,int row,int column,int occupiedBelow,int occupiedAbove,java.util.function.Consumer callback) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.add(widget.wrapperContained,row,column,occupiedBelow,occupiedAbove,callback)); }
public yarnwrap.client.gui.widget.Widget add(yarnwrap.client.gui.widget.Widget widget,int row,int column,java.util.function.Consumer callback) { return new yarnwrap.client.gui.widget.Widget(wrapperContained.add(widget.wrapperContained,row,column,callback)); }

}