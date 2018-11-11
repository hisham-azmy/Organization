package com.org.dao;

import java.util.List;

import com.org.model.IoSettings;

public interface SettingsDao {

	public void AddSettings(IoSettings ioSettings);

	public void updateSettings(IoSettings ioSettings);

	public void deleteSettings(int id);

	public IoSettings getSettings();
	
	public List<IoSettings> getAllSettings();

	public List<String> allNameBySettings(String name);

}
