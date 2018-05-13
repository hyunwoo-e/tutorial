package com.organogram.tutorial.api.organization;

import com.organogram.tutorial.model.Organization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@Controller
public class OrganizationController {

    @Autowired
    OrganizationBO organizationBO;

    @RequestMapping(value = "/api/organization", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity create(@RequestParam String organizationName) {
        organizationBO.insertOrganization(organizationName);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/api/organization/{organizationId}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity select(@PathVariable String organizationId) {
        Organization organization = organizationBO.selectOrganization(organizationId);
        return new ResponseEntity<Organization>(organization, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/organization/{organizationId}", method = RequestMethod.PUT)
    @ResponseBody
    public ResponseEntity update(@PathVariable String organizationId, @RequestParam String organizationName) {
        organizationBO.updateOrganization(organizationId, organizationName);
        return new ResponseEntity(HttpStatus.OK);
    }

    @RequestMapping(value = "/api/organization/{organizationId}", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable String organizationId) {
        organizationBO.deleteOrganization(organizationId);
        return new ResponseEntity(HttpStatus.OK);
    }

    @ExceptionHandler(Exception.class)
    public void globalExceptionHandler(Exception e){
        e.printStackTrace();
    }
}