package com.org.service;

import java.util.List;

import com.org.model.IoGroup;
import com.org.model.IoMember;
import com.org.model.IoSettings;

public interface SettingsServcie {


	public void AddSettings(IoSettings ioSettings);

	public void updateSettings(IoSettings ioSettings);

	public void deleteSettings(int id);

	public List<IoSettings> getAllSettings();

	public List<String> allNameBySettings(String name);
	public IoSettings getSettings();


}
