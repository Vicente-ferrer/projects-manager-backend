package com.vicente.service;


import com.vicente.modal.Chat;
import com.vicente.modal.Project;
import com.vicente.modal.User;

import java.util.List;

public interface ProjectService {

    Project createProject(Project project, User user)throws Exception;

    List<Project> getProjectByTeam(User user, String category, String tag)throws Exception;

    List<Project> getProjectById(Long projectId)throws Exception;

    void deleteProject(Long projectId, Long userId)throws Exception;

    Project updateProject(Project updateProject, Long id)throws Exception;

    void addUserToProject(Long projectId, Long userId)throws Exception;

    void removeUserFromProject(Long projectId, Long userId)throws Exception;

    Chat getChatByProjectId(Long projectId)throws Exception;

}
