/*
** This program is free software: you can redistribute it and/or modify
** it under the terms of the GNU General Public License as published by
** the Free Software Foundation, either version 3 of the License, or
** (at your option) any later version.
**
** This program is distributed in the hope that it will be useful,
** but WITHOUT ANY WARRANTY; without even the implied warranty of
** MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
** GNU General Public License for more details.
**
** You should have received a copy of the GNU General Public License
** along with this program.  If not, see <https://www.gnu.org/licenses/>.
*/
package com.beigebinder.money;

import com.beigebinder.misc.Util;
import net.rim.device.api.system.Application;

public class MoneyAlert extends Application {
	public static final long NOTIFICATIONS_ID = 0xbfc7e381dc83db98L; // com.beigebinder.money.events

	public MoneyAlert() {
		Util.RecurringCheck();
		Util.setIcons(false);
		System.exit(0);
	}
}
