package org.focusns.service.forum.impl;

/*
 * #%L
 * FocusSNS Runtime
 * %%
 * Copyright (C) 2011 - 2013 FocusSNS
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-3.0.html>.
 * #L%
 */


import org.focusns.dao.forum.ForumCategoryDao;
import org.focusns.model.forum.ForumCategory;
import org.focusns.service.forum.ForumCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ForumCategoryServiceImpl implements ForumCategoryService {

    @Autowired
    private ForumCategoryDao forumCategoryDao;

    public ForumCategory getForumCategory(long categoryId) {
        return forumCategoryDao.select(categoryId);
    }

    public void createForumCategory(ForumCategory category) {
        forumCategoryDao.insert(category);
    }

    public void modifyForumCategory(ForumCategory category) {
        forumCategoryDao.update(category);
    }

    public void removeForumCategory(ForumCategory category) {
        forumCategoryDao.delete(category.getId());
    }
}
