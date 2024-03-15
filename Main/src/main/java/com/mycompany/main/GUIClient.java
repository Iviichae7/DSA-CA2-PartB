package com.mycompany.main;

import com.mycompany.main.DLL.GenrePlaylist;
import com.mycompany.main.DLL.Node;
import com.mycompany.main.Stack.LikedSongs;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * @author Michal Babik
 */
public class GUIClient extends javax.swing.JFrame {
    
    // Our liked songs stack
    LikedSongs likedSongs = new LikedSongs();
    
    // Set up for the JList - reference https://stackoverflow.com/questions/8252440/adding-items-to-a-jlist-from-arraylist-using-defaultlistmodel
    DefaultListModel<String> likedSongDisplay = new DefaultListModel<>();
    DefaultListModel<String> genreADisplay = new DefaultListModel<>();
    DefaultListModel<String> genreBDisplay = new DefaultListModel<>();

    // Limiting to two playlist only
    GenrePlaylist genreAPlaylist = new GenrePlaylist("Pop");
    GenrePlaylist genreBPlaylist = new GenrePlaylist("Rap");

    public GUIClient() {
        
        initComponents();
       
        this.setLocationRelativeTo(null);

        likeSongsPanel.setVisible(false);
        likedSongsJList.setVisible(false);
        genreAPlaylistJList.setVisible(false);
        genreBPlaylistJList.setVisible(false);
        addSongsGenreBtn.setVisible(false);
        showSizeLikedListBtn.setVisible(false);
        searchGenreABtn.setVisible(false);
        deleteGenreABtn.setVisible(false);
        displayGenreABtn.setVisible(false);
        moveTopGenreABtn.setVisible(false);
        moveBotoomGenreABtn.setVisible(false);
        searchGenreBBtn.setVisible(false);
        deleteGenreBBtn.setVisible(false);
        showSizeGenreBBtn.setVisible(false);
        moveTopGenreBBtn.setVisible(false);
        moveBotoomGenreBBtn.setVisible(false);
        searchArtistLabelGenreB.setVisible(false);
        searchInputGenreA.setVisible(false);
        searchArtistLabelGenreA.setVisible(false);
        searchInputGenreB.setVisible(false);
        showSizeGenreABtn.setVisible(false);
        displayGenreBBtn.setVisible(false);

        likedSongsList.setModel(likedSongDisplay);
        genreAdisplay.setModel(genreADisplay);
        genreBdisplay.setModel(genreBDisplay);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        mainHeader = new javax.swing.JLabel();
        createPlaylistBtn = new javax.swing.JButton();
        likeSongsPanel = new javax.swing.JPanel();
        artistNameLabel = new javax.swing.JLabel();
        artistTitleLabel = new javax.swing.JLabel();
        artistGenreLabel = new javax.swing.JLabel();
        artistNameInput = new javax.swing.JTextField();
        artistTitleInput = new javax.swing.JTextField();
        addSongBtn = new javax.swing.JButton();
        artistGenreInput = new javax.swing.JComboBox<>();
        likedSongsJList = new javax.swing.JScrollPane();
        likedSongsList = new javax.swing.JList<>();
        addSongsGenreBtn = new javax.swing.JButton();
        genreBPlaylistJList = new javax.swing.JScrollPane();
        genreBdisplay = new javax.swing.JList<>();
        genreAPlaylistJList = new javax.swing.JScrollPane();
        genreAdisplay = new javax.swing.JList<>();
        moveBotoomGenreABtn = new javax.swing.JButton();
        searchGenreABtn = new javax.swing.JButton();
        deleteGenreABtn = new javax.swing.JButton();
        moveTopGenreABtn = new javax.swing.JButton();
        showSizeLikedListBtn = new javax.swing.JButton();
        displayGenreABtn = new javax.swing.JButton();
        moveBotoomGenreBBtn = new javax.swing.JButton();
        searchGenreBBtn = new javax.swing.JButton();
        deleteGenreBBtn = new javax.swing.JButton();
        moveTopGenreBBtn = new javax.swing.JButton();
        showSizeGenreBBtn = new javax.swing.JButton();
        searchArtistLabelGenreA = new javax.swing.JLabel();
        searchInputGenreA = new javax.swing.JTextField();
        searchArtistLabelGenreB = new javax.swing.JLabel();
        searchInputGenreB = new javax.swing.JTextField();
        showSizeGenreABtn = new javax.swing.JButton();
        displayGenreBBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setPreferredSize(new java.awt.Dimension(800, 900));
        mainPanel.setLayout(null);

        mainHeader.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        mainHeader.setForeground(new java.awt.Color(0, 0, 0));
        mainHeader.setText("Music Application");
        mainPanel.add(mainHeader);
        mainHeader.setBounds(278, 20, 302, 48);

        createPlaylistBtn.setBackground(new java.awt.Color(0, 0, 0));
        createPlaylistBtn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        createPlaylistBtn.setForeground(new java.awt.Color(255, 255, 255));
        createPlaylistBtn.setText("Create a Playlist");
        createPlaylistBtn.setBorderPainted(false);
        createPlaylistBtn.setDefaultCapable(false);
        createPlaylistBtn.setFocusPainted(false);
        createPlaylistBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createPlaylistBtnActionPerformed(evt);
            }
        });
        mainPanel.add(createPlaylistBtn);
        createPlaylistBtn.setBounds(308, 80, 230, 50);

        likeSongsPanel.setBackground(new java.awt.Color(204, 204, 204));
        likeSongsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Song:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(0, 0, 0))); // NOI18N

        artistNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        artistNameLabel.setForeground(new java.awt.Color(0, 0, 0));
        artistNameLabel.setText("Artist name:");

        artistTitleLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        artistTitleLabel.setForeground(new java.awt.Color(0, 0, 0));
        artistTitleLabel.setText("Title:");

        artistGenreLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        artistGenreLabel.setForeground(new java.awt.Color(0, 0, 0));
        artistGenreLabel.setText("Genre:");

        artistNameInput.setBackground(new java.awt.Color(255, 255, 255));

        artistTitleInput.setBackground(new java.awt.Color(255, 255, 255));

        addSongBtn.setBackground(new java.awt.Color(0, 0, 0));
        addSongBtn.setForeground(new java.awt.Color(255, 255, 255));
        addSongBtn.setText("Add Song");
        addSongBtn.setBorderPainted(false);
        addSongBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSongBtnActionPerformed(evt);
            }
        });

        artistGenreInput.setBackground(new java.awt.Color(255, 255, 255));
        artistGenreInput.setForeground(new java.awt.Color(0, 0, 0));
        artistGenreInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pop", "Rap" }));

        javax.swing.GroupLayout likeSongsPanelLayout = new javax.swing.GroupLayout(likeSongsPanel);
        likeSongsPanel.setLayout(likeSongsPanelLayout);
        likeSongsPanelLayout.setHorizontalGroup(
            likeSongsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(likeSongsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(likeSongsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(artistNameLabel)
                    .addComponent(artistTitleLabel)
                    .addComponent(artistGenreLabel))
                .addGap(18, 18, 18)
                .addGroup(likeSongsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(artistGenreInput, 0, 220, Short.MAX_VALUE)
                    .addComponent(artistTitleInput)
                    .addComponent(artistNameInput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                .addComponent(addSongBtn)
                .addContainerGap())
        );
        likeSongsPanelLayout.setVerticalGroup(
            likeSongsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(likeSongsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(likeSongsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(artistNameLabel)
                    .addComponent(artistNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(likeSongsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(artistTitleLabel)
                    .addComponent(artistTitleInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(likeSongsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(artistGenreLabel)
                    .addComponent(artistGenreInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addSongBtn))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        mainPanel.add(likeSongsPanel);
        likeSongsPanel.setBounds(60, 140, 680, 131);

        likedSongsList.setBackground(new java.awt.Color(204, 204, 204));
        likedSongsList.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Liked Songs Playlist", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        likedSongsList.setForeground(new java.awt.Color(0, 0, 0));
        likedSongsJList.setViewportView(likedSongsList);

        mainPanel.add(likedSongsJList);
        likedSongsJList.setBounds(60, 291, 680, 110);

        addSongsGenreBtn.setBackground(new java.awt.Color(0, 0, 0));
        addSongsGenreBtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        addSongsGenreBtn.setForeground(new java.awt.Color(255, 255, 255));
        addSongsGenreBtn.setText("Add Song to Genre");
        addSongsGenreBtn.setBorderPainted(false);
        addSongsGenreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSongsGenreBtnActionPerformed(evt);
            }
        });
        mainPanel.add(addSongsGenreBtn);
        addSongsGenreBtn.setBounds(589, 420, 150, 22);

        genreBdisplay.setBackground(new java.awt.Color(204, 204, 204));
        genreBdisplay.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Genre B (Rap)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        genreBdisplay.setForeground(new java.awt.Color(0, 0, 0));
        genreBPlaylistJList.setViewportView(genreBdisplay);

        mainPanel.add(genreBPlaylistJList);
        genreBPlaylistJList.setBounds(60, 670, 680, 130);

        genreAdisplay.setBackground(new java.awt.Color(204, 204, 204));
        genreAdisplay.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Genre A (Pop)", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        genreAdisplay.setForeground(new java.awt.Color(0, 0, 0));
        genreAPlaylistJList.setViewportView(genreAdisplay);

        mainPanel.add(genreAPlaylistJList);
        genreAPlaylistJList.setBounds(60, 461, 680, 130);

        moveBotoomGenreABtn.setBackground(new java.awt.Color(0, 0, 0));
        moveBotoomGenreABtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        moveBotoomGenreABtn.setForeground(new java.awt.Color(255, 255, 255));
        moveBotoomGenreABtn.setText("MoveBottom");
        moveBotoomGenreABtn.setBorderPainted(false);
        moveBotoomGenreABtn.setDefaultCapable(false);
        moveBotoomGenreABtn.setFocusable(false);
        mainPanel.add(moveBotoomGenreABtn);
        moveBotoomGenreABtn.setBounds(640, 630, 100, 22);

        searchGenreABtn.setBackground(new java.awt.Color(0, 0, 0));
        searchGenreABtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        searchGenreABtn.setForeground(new java.awt.Color(255, 255, 255));
        searchGenreABtn.setText("Search");
        searchGenreABtn.setBorderPainted(false);
        searchGenreABtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchGenreABtnActionPerformed(evt);
            }
        });
        mainPanel.add(searchGenreABtn);
        searchGenreABtn.setBounds(550, 600, 80, 22);

        deleteGenreABtn.setBackground(new java.awt.Color(0, 0, 0));
        deleteGenreABtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        deleteGenreABtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteGenreABtn.setText("Delete");
        deleteGenreABtn.setBorderPainted(false);
        deleteGenreABtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteGenreABtnActionPerformed(evt);
            }
        });
        mainPanel.add(deleteGenreABtn);
        deleteGenreABtn.setBounds(550, 630, 80, 22);

        moveTopGenreABtn.setBackground(new java.awt.Color(0, 0, 0));
        moveTopGenreABtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        moveTopGenreABtn.setForeground(new java.awt.Color(255, 255, 255));
        moveTopGenreABtn.setText("MoveTop");
        moveTopGenreABtn.setBorderPainted(false);
        moveTopGenreABtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveTopGenreABtnActionPerformed(evt);
            }
        });
        mainPanel.add(moveTopGenreABtn);
        moveTopGenreABtn.setBounds(640, 600, 100, 22);

        showSizeLikedListBtn.setBackground(new java.awt.Color(0, 0, 0));
        showSizeLikedListBtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        showSizeLikedListBtn.setForeground(new java.awt.Color(255, 255, 255));
        showSizeLikedListBtn.setText("Show Size");
        showSizeLikedListBtn.setBorderPainted(false);
        showSizeLikedListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSizeLikedListBtnActionPerformed(evt);
            }
        });
        mainPanel.add(showSizeLikedListBtn);
        showSizeLikedListBtn.setBounds(60, 420, 90, 22);

        displayGenreABtn.setBackground(new java.awt.Color(0, 0, 0));
        displayGenreABtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        displayGenreABtn.setForeground(new java.awt.Color(255, 255, 255));
        displayGenreABtn.setText("Display");
        displayGenreABtn.setBorderPainted(false);
        displayGenreABtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayGenreABtnActionPerformed(evt);
            }
        });
        mainPanel.add(displayGenreABtn);
        displayGenreABtn.setBounds(160, 600, 90, 22);

        moveBotoomGenreBBtn.setBackground(new java.awt.Color(0, 0, 0));
        moveBotoomGenreBBtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        moveBotoomGenreBBtn.setForeground(new java.awt.Color(255, 255, 255));
        moveBotoomGenreBBtn.setText("MoveBottom");
        moveBotoomGenreBBtn.setBorderPainted(false);
        mainPanel.add(moveBotoomGenreBBtn);
        moveBotoomGenreBBtn.setBounds(640, 840, 100, 22);

        searchGenreBBtn.setBackground(new java.awt.Color(0, 0, 0));
        searchGenreBBtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        searchGenreBBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchGenreBBtn.setText("Search");
        searchGenreBBtn.setBorderPainted(false);
        searchGenreBBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchGenreBBtnActionPerformed(evt);
            }
        });
        mainPanel.add(searchGenreBBtn);
        searchGenreBBtn.setBounds(550, 810, 80, 22);

        deleteGenreBBtn.setBackground(new java.awt.Color(0, 0, 0));
        deleteGenreBBtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        deleteGenreBBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteGenreBBtn.setText("Delete");
        deleteGenreBBtn.setBorderPainted(false);
        deleteGenreBBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteGenreBBtnActionPerformed(evt);
            }
        });
        mainPanel.add(deleteGenreBBtn);
        deleteGenreBBtn.setBounds(550, 840, 80, 22);

        moveTopGenreBBtn.setBackground(new java.awt.Color(0, 0, 0));
        moveTopGenreBBtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        moveTopGenreBBtn.setForeground(new java.awt.Color(255, 255, 255));
        moveTopGenreBBtn.setText("MoveTop");
        moveTopGenreBBtn.setBorderPainted(false);
        moveTopGenreBBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveTopGenreBBtnActionPerformed(evt);
            }
        });
        mainPanel.add(moveTopGenreBBtn);
        moveTopGenreBBtn.setBounds(640, 810, 100, 22);

        showSizeGenreBBtn.setBackground(new java.awt.Color(0, 0, 0));
        showSizeGenreBBtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        showSizeGenreBBtn.setForeground(new java.awt.Color(255, 255, 255));
        showSizeGenreBBtn.setText("Show Size");
        showSizeGenreBBtn.setBorderPainted(false);
        showSizeGenreBBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSizeGenreBBtnActionPerformed(evt);
            }
        });
        mainPanel.add(showSizeGenreBBtn);
        showSizeGenreBBtn.setBounds(60, 810, 90, 22);

        searchArtistLabelGenreA.setForeground(new java.awt.Color(0, 0, 0));
        searchArtistLabelGenreA.setText("Search by Artist:");
        mainPanel.add(searchArtistLabelGenreA);
        searchArtistLabelGenreA.setBounds(300, 600, 94, 16);

        searchInputGenreA.setBackground(new java.awt.Color(204, 204, 204));
        mainPanel.add(searchInputGenreA);
        searchInputGenreA.setBounds(400, 600, 131, 22);

        searchArtistLabelGenreB.setForeground(new java.awt.Color(0, 0, 0));
        searchArtistLabelGenreB.setText("Search by Artist:");
        mainPanel.add(searchArtistLabelGenreB);
        searchArtistLabelGenreB.setBounds(300, 810, 94, 16);

        searchInputGenreB.setBackground(new java.awt.Color(204, 204, 204));
        mainPanel.add(searchInputGenreB);
        searchInputGenreB.setBounds(400, 810, 131, 22);

        showSizeGenreABtn.setBackground(new java.awt.Color(0, 0, 0));
        showSizeGenreABtn.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        showSizeGenreABtn.setForeground(new java.awt.Color(255, 255, 255));
        showSizeGenreABtn.setText("Show Size");
        showSizeGenreABtn.setBorderPainted(false);
        showSizeGenreABtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showSizeGenreABtnActionPerformed(evt);
            }
        });
        mainPanel.add(showSizeGenreABtn);
        showSizeGenreABtn.setBounds(60, 600, 90, 22);

        displayGenreBBtn.setBackground(new java.awt.Color(0, 0, 0));
        displayGenreBBtn.setForeground(new java.awt.Color(255, 255, 255));
        displayGenreBBtn.setText("Display");
        displayGenreBBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayGenreBBtnActionPerformed(evt);
            }
        });
        mainPanel.add(displayGenreBBtn);
        displayGenreBBtn.setBounds(160, 810, 90, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createPlaylistBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createPlaylistBtnActionPerformed
        likeSongsPanel.setVisible(true);
        likedSongsJList.setVisible(true);
        genreAPlaylistJList.setVisible(true);
        genreBPlaylistJList.setVisible(true);
        addSongsGenreBtn.setVisible(true);
        showSizeLikedListBtn.setVisible(true);
        searchGenreABtn.setVisible(true);
        deleteGenreABtn.setVisible(true);
        displayGenreABtn.setVisible(true);
        moveTopGenreABtn.setVisible(true);
        moveBotoomGenreABtn.setVisible(true);
        searchGenreBBtn.setVisible(true);
        deleteGenreBBtn.setVisible(true);
        showSizeGenreBBtn.setVisible(true);
        moveTopGenreBBtn.setVisible(true);
        moveBotoomGenreBBtn.setVisible(true);
        searchInputGenreB.setVisible(true);
        searchArtistLabelGenreB.setVisible(true);
        searchInputGenreA.setVisible(true);
        searchArtistLabelGenreA.setVisible(true);
        showSizeGenreABtn.setVisible(true);
        displayGenreBBtn.setVisible(true);

    }//GEN-LAST:event_createPlaylistBtnActionPerformed

    private void addSongBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSongBtnActionPerformed
        // First we need to extract the inputs from the user and wrapp them
        String artistName = artistNameInput.getText();
        String songTitle = artistTitleInput.getText();
        String genre = (String)artistGenreInput.getSelectedItem();
        
        // Then we need to create a song and pass those extracted inputs
        Song song = new Song(artistName, songTitle, genre);
        
        // Then we can add the new song to the stack.
        likedSongs.addSong(song);
        
        // We want to display the song in the JList thats define in the GUI
        likedSongDisplay.addElement(song.toString());
        
        // Once the song is added to the JList model we can reset the input fields
        artistNameInput.setText("");
        artistTitleInput.setText("");
    }//GEN-LAST:event_addSongBtnActionPerformed

    private void addSongsGenreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSongsGenreBtnActionPerformed
        
        // Adding songs from the stack to the two Genre playlist
        // Need to check wether the stack has any elements
        if(!likedSongs.isEmpty()){
            // Then we can remove the last element
            Song last = likedSongs.pop();
            
            // When its removed we want to display it in the JList depedning on the genre of the song
            if(last.getGenre().equals("Pop")){
                genreAPlaylist.addSong(last);
                
                // Then we can update the Jlist
                genreADisplay.addElement(last.toString());
            } else if (last.getGenre().equals("Rap")){
                genreBPlaylist.addSong(last);
                
                // Then we can update the Jlist
                genreBDisplay.addElement(last.toString());
            }
            
            // Once its reflected in either genre playlist we can removed it from the liked songs JList
            likedSongDisplay.removeElement(last.toString());
        }
    }//GEN-LAST:event_addSongsGenreBtnActionPerformed

    private void showSizeLikedListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSizeLikedListBtnActionPerformed
        int size = likedSongs.size();
        
        // Alerting user with JOptionPane message window
        JOptionPane.showMessageDialog(null, "The size of the liked songs playlist is: " + size);
    }//GEN-LAST:event_showSizeLikedListBtnActionPerformed

    private void searchGenreABtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchGenreABtnActionPerformed
       // First we want to get the input
       String artistName = searchInputGenreA.getText();
       
       // Then we want to search for that artist in our DLL
       Song song = genreAPlaylist.search(artistName);
       
       // If we find the song we print it
       if(song != null){
           JOptionPane.showMessageDialog(null, "Artist found: " + song.getArtist() + "\n" + "Song title: " + song.getTitle() + "\n" + "Genre: " + song.getGenre());
           // Reset the input field
           searchInputGenreA.setText("");
       } else {
           JOptionPane.showMessageDialog(null, "Artist not foun");
           searchInputGenreA.setText("");
       }
    }//GEN-LAST:event_searchGenreABtnActionPerformed

    private void searchGenreBBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchGenreBBtnActionPerformed
        // First we want to get the input
       String artistName = searchInputGenreB.getText();
       
       // Then we want to search for that artist in our DLL
       Song song = genreBPlaylist.search(artistName);
       
       // If we find the song we print it
       if(song != null){
           JOptionPane.showMessageDialog(null, "Artist found: " + song.getArtist() + "\n" + "Song title: " + song.getTitle() + "\n" + "Genre: " + song.getGenre());
           // Reset the input field
           searchInputGenreB.setText("");
       } else {
           JOptionPane.showMessageDialog(null, "Artist not foun");
           searchInputGenreB.setText("");
       }
    }//GEN-LAST:event_searchGenreBBtnActionPerformed

    private void deleteGenreABtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteGenreABtnActionPerformed
        // First we Delete the last song from the dll
        genreAPlaylist.deleteLastSong();
        
        // Then we can remove it from the JList
        // First we check if its empty or not
        if(!genreADisplay.isEmpty()){
            genreADisplay.removeElementAt(genreADisplay.getSize() - 1);
        }
    }//GEN-LAST:event_deleteGenreABtnActionPerformed

    private void deleteGenreBBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteGenreBBtnActionPerformed
        // First we Delete the last song from the dll
        genreBPlaylist.deleteLastSong();
        
        // Then we can remove it from the JList
        // First we check if its empty or not
        if(!genreBDisplay.isEmpty()){
            genreBDisplay.removeElementAt(genreBDisplay.getSize() - 1);
        }
    }//GEN-LAST:event_deleteGenreBBtnActionPerformed

    private void showSizeGenreABtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSizeGenreABtnActionPerformed
        int size = genreAPlaylist.getSongCount();
        
        // Alerting user with JOptionPane message window
        JOptionPane.showMessageDialog(null, "The size of the Pop songs playlist is: " + size);
    }//GEN-LAST:event_showSizeGenreABtnActionPerformed

    private void displayGenreABtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayGenreABtnActionPerformed
        String songs = genreAPlaylist.displaySongs();
        
        JOptionPane.showMessageDialog(null, songs);
    }//GEN-LAST:event_displayGenreABtnActionPerformed

    private void displayGenreBBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayGenreBBtnActionPerformed
        String songs = genreBPlaylist.displaySongs();
        
        JOptionPane.showMessageDialog(null, songs);
    }//GEN-LAST:event_displayGenreBBtnActionPerformed

    private void showSizeGenreBBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showSizeGenreBBtnActionPerformed
        int size = genreBPlaylist.getSongCount();
        // Alerting user with JOptionPane message window
        JOptionPane.showMessageDialog(null, "The size of the Pop songs playlist is: " + size);
    }//GEN-LAST:event_showSizeGenreBBtnActionPerformed

    private void moveTopGenreABtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveTopGenreABtnActionPerformed
        // Manipulate the DLL to move the last elemnt to the top
        genreAPlaylist.moveToTop();

        // Clear the content of the JList
        genreADisplay.clear();

        Node node = genreAPlaylist.getHead();
        
        while (node != null) {
            // Add the song to the playlist
            genreADisplay.addElement(node.getSong().toString());
            
            // Move to the next playlist 
            node = node.getNext();
        }
    }//GEN-LAST:event_moveTopGenreABtnActionPerformed

    private void moveTopGenreBBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveTopGenreBBtnActionPerformed
        // Manipulate the DLL to move the last elemnt to the top
        genreBPlaylist.moveToTop();

        // Clear the content of the JList
        genreBDisplay.clear();

        Node node = genreBPlaylist.getHead();
        // Iterate over the DLL
        while (node != null) {
            // Add the song to the playlist JList
            genreBDisplay.addElement(node.getSong().toString());
            // Move to the next node if node next is not null 
            node = node.getNext();
        }
    }//GEN-LAST:event_moveTopGenreBBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSongBtn;
    private javax.swing.JButton addSongsGenreBtn;
    private javax.swing.JComboBox<String> artistGenreInput;
    private javax.swing.JLabel artistGenreLabel;
    private javax.swing.JTextField artistNameInput;
    private javax.swing.JLabel artistNameLabel;
    private javax.swing.JTextField artistTitleInput;
    private javax.swing.JLabel artistTitleLabel;
    private javax.swing.JButton createPlaylistBtn;
    private javax.swing.JButton deleteGenreABtn;
    private javax.swing.JButton deleteGenreBBtn;
    private javax.swing.JButton displayGenreABtn;
    private javax.swing.JButton displayGenreBBtn;
    private javax.swing.JScrollPane genreAPlaylistJList;
    private javax.swing.JList<String> genreAdisplay;
    private javax.swing.JScrollPane genreBPlaylistJList;
    private javax.swing.JList<String> genreBdisplay;
    private javax.swing.JPanel likeSongsPanel;
    private javax.swing.JScrollPane likedSongsJList;
    private javax.swing.JList<String> likedSongsList;
    private javax.swing.JLabel mainHeader;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton moveBotoomGenreABtn;
    private javax.swing.JButton moveBotoomGenreBBtn;
    private javax.swing.JButton moveTopGenreABtn;
    private javax.swing.JButton moveTopGenreBBtn;
    private javax.swing.JLabel searchArtistLabelGenreA;
    private javax.swing.JLabel searchArtistLabelGenreB;
    private javax.swing.JButton searchGenreABtn;
    private javax.swing.JButton searchGenreBBtn;
    private javax.swing.JTextField searchInputGenreA;
    private javax.swing.JTextField searchInputGenreB;
    private javax.swing.JButton showSizeGenreABtn;
    private javax.swing.JButton showSizeGenreBBtn;
    private javax.swing.JButton showSizeLikedListBtn;
    // End of variables declaration//GEN-END:variables
}
