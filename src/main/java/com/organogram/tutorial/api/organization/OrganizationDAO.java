package com.organogram.tutorial.api.organization;

import com.organogram.tutorial.model.Organization;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.*;

@Repository
public interface OrganizationDAO {
    int insertOrganization(@Param("organizationName") String organizationName);

    Organization selectOrganization(@Param("organizationId") String organizationId);

    int updateOrganization(@Param("organizationId") String organizationId, @Param("organizationName") String organizationName);

    int deleteOrganization(@Param("organizationId") String organizationId);
}

