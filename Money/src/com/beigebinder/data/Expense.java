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
package com.beigebinder.data;

import com.beigebinder.misc.Util;
import net.rim.device.api.synchronization.SyncObject;
import net.rim.device.api.util.Arrays;
import net.rim.device.api.util.Persistable;

public class Expense extends Transaction implements Persistable, SyncObject {
	private String[] _descriptions;
	private int[] _accounts;
	private long[] _amounts;

	public String[] getDescriptions() {
		return _descriptions;
	}

	public void setDescriptions(String[] descriptions) {
		this._descriptions = descriptions;
	}

	public int[] getAccounts() {
		return _accounts;
	}

	public void setAccounts(int[] accounts) {
		this._accounts = accounts;
	}

	public long[] getAmounts() {
		return _amounts;
	}

	public void setAmounts(long[] amounts) {
		this._amounts = amounts;
	}

	public Object clone() {
		Expense expense = new Expense();
		expense._id = _id;
		expense._parentAccount = _parentAccount;
		expense._status = _status;
		expense._number = _number;
		expense._description = new String(_description);
		expense._date = _date;
		expense._amount = _amount;
		expense._descriptions = Util.copy(_descriptions);
		expense._accounts = Arrays.copy(_accounts);
		expense._amounts = Arrays.copy(_amounts);
		expense._dirty = _dirty;
		return expense;
	}

	public int getUID() {
		return _id;
	}
}
