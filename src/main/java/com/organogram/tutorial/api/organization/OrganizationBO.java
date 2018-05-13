package com.organogram.tutorial.api.organization;


import com.organogram.tutorial.model.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationBO {

    @Autowired
    OrganizationDAO organizationDAO;

    public int insertOrganization(String organizationName) {
        return organizationDAO.insertOrganization(organizationName);
    }

    public Organization selectOrganization(String organizationId) {
        return organizationDAO.selectOrganization(organizationId);
    }

    public int updateOrganization(String organizationId, String organizationName) {
        return organizationDAO.updateOrganization(organizationId, organizationName);
    }

    public void deleteOrganization(String organizationId) {
        organizationDAO.deleteOrganization(organizationId);
    }
}

