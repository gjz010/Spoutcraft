/*
 * This file is part of Spoutcraft.
 *
 * Copyright (c) 2011 Spout LLC <http://www.spout.org/>
 * Spoutcraft is licensed under the GNU Lesser General Public License.
 *
 * Spoutcraft is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Spoutcraft is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.spoutcraft.client.gui.settings.controls;

import org.spoutcraft.api.gui.GenericCheckBox;
import org.spoutcraft.client.config.Configuration;

public class HotbarQuickKeysButton extends GenericCheckBox {
	public HotbarQuickKeysButton() {
		super("数字键切换项目");
		setChecked(Configuration.isHotbarQuickKeysEnabled());
		setTooltip("0-9键切换快捷栏项目\n" +
				"OFF - 0-9键不通过切换快捷栏项目\n" +
				"ON - （默认）0-9键开关通过快捷栏项目");
	}

	@Override
	public void onButtonClick() {
		Configuration.setHotbarQuickKeysEnabled(!Configuration.isHotbarQuickKeysEnabled());
		Configuration.write();
	}
}
